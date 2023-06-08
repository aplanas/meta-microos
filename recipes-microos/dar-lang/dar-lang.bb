SUMMARY = "Translations for package dar"
DESCRIPTION = "Provides translations for the 'dar' package."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.8"

RPM_NAME = "dar-lang-2.7.8-1.4.noarch.rpm"
RPM_HASH = "2e30d463fd77bfe5c7b476d32a475b52927cf0df1e15a772b0c1fbe86287546efbf5d69af9be6d6b50811369e438a4d37b73bd2483ffee1798a08eb514f9b656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dar-lang dar-lang-all locale(dar:fr) locale(dar:sv)"
RDEPENDS:${PN} += "dar"

inherit rpm
