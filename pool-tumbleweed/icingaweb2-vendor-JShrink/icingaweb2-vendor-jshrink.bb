SUMMARY = "Icinga Web 2 vendor library JShrink"
DESCRIPTION = "Icinga Web 2 vendor library JShrink."
LICENSE = "BSD-3-Clause"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-JShrink-2.11.4-2.1.noarch.rpm"
RPM_HASH = "83eaf094d0f4bd723ada36151a0e8cba180ea885bce2aaa38050600ecd93d7eb17609340e3e2fad3674628529cd864b851fc350d0a4549a07747c42ca013d2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-JShrink"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
