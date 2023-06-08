SUMMARY = "Haskell hslua-cli library development files"
DESCRIPTION = "This package provides the Haskell hslua-cli library development files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-devel-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "75d84ae89da341d9b3f93d45ae481a86ff254f4f656b383ce36b17be5d00cf297b1cf8cbc7d4b672f70c70a458772dfa48cfc66f3b304db6a26377067d483ad9"

RPROVIDES:${PN} += "ghc-devel(hslua-cli-1.4.1-EEaz0ST6ErtHZSjIcYe3Kp) ghc-hslua-cli-devel ghc-hslua-cli-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-devel(hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1) ghc-devel(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) ghc-devel(text-2.0.2) ghc-devel(unix-2.7.3) ghc-hslua-cli"

inherit rpm
