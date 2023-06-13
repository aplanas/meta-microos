SUMMARY = "Haskell text-conversions profiling library"
DESCRIPTION = "This package provides the Haskell text-conversions profiling library."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-prof-0.3.1.1-2.2.aarch64.rpm"
RPM_HASH = "642c5a66b2ad64091bd385453f6c206243746e9c927a934a42220716eda6eb6a157672147d8189bde60763fccea75b3c11d7180f96a0ff68259c0e41dda275a1"

RPROVIDES:${PN} += "ghc-prof(text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS) \
ghc-text-conversions-prof \
ghc-text-conversions-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(text-2.0.2) \
ghc-text-conversions-devel"

inherit rpm
