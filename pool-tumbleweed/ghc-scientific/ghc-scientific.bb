SUMMARY = "Numbers represented using scientific notation"
DESCRIPTION = "'Data.Scientific' provides the number type 'Scientific'. Scientific numbers are \
arbitrary precision and space efficient. They are represented using \
<http://en.wikipedia.org/wiki/Scientific_notation scientific notation>. \
The implementation uses a coefficient 'c :: 'Integer'' and a base-10 exponent \
'e :: 'Int''. A scientific number corresponds to the 'Fractional' number: \
''fromInteger' c * 10 '^^' e'. \
 \
Note that since we're using an 'Int' to represent the exponent these numbers \
aren't truly arbitrary precision. I intend to change the type of the exponent \
to 'Integer' in a future release. \
 \
The main application of 'Scientific' is to be used as the target of parsing \
arbitrary precision numbers coming from an untrusted source. The advantages \
over using 'Rational' for this are that: \
 \
* A 'Scientific' is more efficient to construct. Rational numbers need to be \
constructed using '%' which has to compute the 'gcd' of the 'numerator' and \
'denominator'. \
 \
* 'Scientific' is safe against numbers with huge exponents. For example: \
'1e1000000000 :: 'Rational'' will fill up all space and crash your program. \
Scientific works as expected: \
 \
>>> read '1e1000000000' :: Scientific 1.0e1000000000 \
 \
* Also, the space usage of converting scientific numbers with huge exponents to \
''Integral's' (like: 'Int') or ''RealFloat's' (like: 'Double' or 'Float') will \
always be bounded by the target type."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-0.3.7.0-5.6.aarch64.rpm"
RPM_HASH = "b5fa806175356e870275ffa8f394a2d3cedaed7e90fb60fbc57816b7495f843da0ea11bd562cd59a1205323e3506d83ae8863253b55a4d203ea2ec48669a4de0"

RPROVIDES:${PN} += "ghc-scientific \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
