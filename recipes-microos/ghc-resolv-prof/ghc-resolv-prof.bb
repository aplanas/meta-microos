SUMMARY = "Haskell resolv profiling library"
DESCRIPTION = "This package provides the Haskell resolv profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-prof-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "389125b53c59a0dc9c6e42ea59c3e5a3a381adde4620e134b323a132697c91ded822d731e70f84fb6b6072f4aaede0c3b826045b53a6fb837a7a6089133e11de"

RPROVIDES:${PN} += "ghc-prof(resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr) ghc-resolv-prof ghc-resolv-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-prof(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-resolv-devel"

inherit rpm
