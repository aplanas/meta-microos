SUMMARY = "Fish Completion for salt"
DESCRIPTION = "Fish command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-fish-completion-3006.0-4.1.noarch.rpm"
RPM_HASH = "04b00a85ffcec2561ed62a30aa07329532e40ed0c19efad786f136727703976fe0f274c0bb228d8d5baf25d015fa198b3cfede7998e42d0001d15f5d49c84664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-fish-completion"

RDEPENDS:${PN} += "salt"

inherit rpm
