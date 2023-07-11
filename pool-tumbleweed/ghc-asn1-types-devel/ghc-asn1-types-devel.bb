SUMMARY = "Haskell asn1-types library development files"
DESCRIPTION = "This package provides the Haskell asn1-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-devel-0.3.4-5.6.aarch64.rpm"
RPM_HASH = "2ff8056c101fef5feecda5c3e880d627b6d74c7111037c1d12154aabe0be34349b4b656583b73bb76b991bd93474decda083ce42e839043f90b433cee55b7472"

RPROVIDES:${PN} += "ghc-asn1-types-devel \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-types \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp"

inherit rpm
