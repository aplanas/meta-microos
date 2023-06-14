SUMMARY = "Haskell criterion library development files"
DESCRIPTION = "This package provides the Haskell criterion library development files."
LICENSE = "BSD-2-Clause"

PV = "1.6.0.0"

RPM_NAME = "ghc-criterion-devel-1.6.0.0-2.4.aarch64.rpm"
RPM_HASH = "612224ee18dabaadc2e6263c7f019b9b630b5fb7f565acfda83b7d162e6d2de356ce94338f9733c8adc7ec4a66c654cab25b37edf1740669e88f4e887907cf53"

RPROVIDES:${PN} += "ghc-criterion-devel \
ghc-devel-criterion-1.6.0.0-DRzDBgvFHz63cqdMc7T97x"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-criterion \
ghc-devel-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy \
ghc-devel-binary-0.8.9.1 \
ghc-devel-binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-devel-code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D \
ghc-devel-containers-0.6.7 \
ghc-devel-criterion-measurement-0.2.1.0-87nlGOXoqxrBN5mUt0bPv1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-js-chart-2.9.4.1-3Q5pmv83RztDkZZL9zv96d \
ghc-devel-microstache-1.0.2.3-AHAKnK06lT6DHccapktUKL \
ghc-devel-mtl-2.2.2 \
ghc-devel-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-devel-optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-statistics-0.16.2.0-LfIwroNJuQDMt3pStkU86 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6"

inherit rpm
