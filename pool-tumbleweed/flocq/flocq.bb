SUMMARY = "Formalization of floating point numbers for Coq"
DESCRIPTION = "Flocq (Floats for Coq) is a floating-point formalization for the Coq \
system.  It provides a comprehensive library of theorems on a \
multi-radix multi-precision arithmetic.  It also supports efficient \
numerical computations inside Coq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "flocq-4.1.1-1.5.aarch64.rpm"
RPM_HASH = "585061c18412ced5e1d8f654fb6cde32dd4045b1745cae122a9cf3e4e4096dc314949a19baa6d16da0078f1bc2c1865df40adb0a10a714ace3f42aac98b41a1b"

RPROVIDES:${PN} += "flocq"

RDEPENDS:${PN} += "coq"

inherit rpm
