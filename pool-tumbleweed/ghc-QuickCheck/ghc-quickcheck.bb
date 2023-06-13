SUMMARY = "Automatic testing of Haskell programs"
DESCRIPTION = "QuickCheck is a library for random testing of program properties. The \
programmer provides a specification of the program, in the form of properties \
which functions should satisfy, and QuickCheck then tests that the properties \
hold in a large number of randomly generated cases. Specifications are \
expressed in Haskell, using combinators provided by QuickCheck. \
QuickCheck provides combinators to define properties, observe the distribution \
of test data, and define test data generators. \
 \
Most of QuickCheck's functionality is exported by the main 'Test.QuickCheck' \
module. The main exception is the monadic property testing library in \
'Test.QuickCheck.Monadic'. \
 \
If you are new to QuickCheck, you can try looking at the following resources: \
 \
* The <http://www.cse.chalmers.se/~rjmh/QuickCheck/manual.html official \
QuickCheck manual>. It's a bit out-of-date in some details and doesn't cover \
newer QuickCheck features, but is still full of good advice. * \
<https://begriffs.com/posts/2017-01-14-design-use-quickcheck.html>, a detailed \
tutorial written by a user of QuickCheck. \
 \
The <https://hackage.haskell.org/package/quickcheck-instances \
quickcheck-instances> companion package provides instances for types in Haskell \
Platform packages at the cost of additional dependencies."
LICENSE = "BSD-3-Clause"

PV = "2.14.2"

RPM_NAME = "ghc-QuickCheck-2.14.2-3.3.aarch64.rpm"
RPM_HASH = "3751946922f20b519093c11c4b2dab85dc4f10432589bba8bbea84c8f1111c98a0aca1b008c4ddc2fb1c823f89d4171c5965e498fbdc95ba5c8f2fc0fbbe09b9"

RPROVIDES:${PN} += "ghc-QuickCheck \
ghc-QuickCheck(aarch-64) \
libHSQuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
