SUMMARY = "Haskell98 invariant functors"
DESCRIPTION = "Haskell98 invariant functors (also known as exponential functors). \
 \
For more information, see Edward Kmett's article 'Rotten Bananas': \
 \
<http://comonad.com/reader/2008/rotten-bananas/>."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-invariant-0.6.2-1.2.aarch64.rpm"
RPM_HASH = "3984e64de3c0fb37b273a5d2c55f55573bcfa990b4648db1b70c5f562df19ee0643985d7e135043492c78faf2db2a203a9b81d4895b24d4cdad16adac55af29f"

RPROVIDES:${PN} += "ghc-invariant \
libHSinvariant-0.6.2-1eF4QVqz69AFovgmNz4wk7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprofunctors-5.6.2-GfNUFxHNpLn859duquR0iv-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
