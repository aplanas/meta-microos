SUMMARY = "Haskell resolv library development files"
DESCRIPTION = "This package provides the Haskell resolv library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-devel-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "b0def907ac86f50a3b0e62eae5f104d39f94a1dfb41a1ce25e30dd26033af35583f06d86cfee97172f9d9ed502257cb3953cecae0a13b567906d5bc0b362143d"

RPROVIDES:${PN} += "ghc-devel(resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr) ghc-resolv-devel ghc-resolv-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-resolv"

inherit rpm
