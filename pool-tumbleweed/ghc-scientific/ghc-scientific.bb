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

RPM_NAME = "ghc-scientific-0.3.7.0-5.9.aarch64.rpm"
RPM_HASH = "aec642667f88ae5cbf6682a0727d7bd26ca0dc3d83d13bfa76f63108a2b14a19abecadb5924629b90fb93bbda769bff10a81120584643bad75b3b5e6a05d5ea3"

RPROVIDES:${PN} += "ghc-scientific \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
