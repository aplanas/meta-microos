SUMMARY = "The Elementary Plank theme"
DESCRIPTION = "The official elementary plank theme."
LICENSE = "GPL-3.0-only"

PV = "5.3.0"

RPM_NAME = "plank-theme-elementary-5.3.0-1.10.noarch.rpm"
RPM_HASH = "4f9fe2b3786535960e97d52141d5696050cb5f6ac1570e86585e2b440c2ca7c1e94ac3deed63c77ed5d491daa27e39122d092385225531271c50d5cdd5f28288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-theme-elementary"

RDEPENDS:${PN} += "plank"

inherit rpm
