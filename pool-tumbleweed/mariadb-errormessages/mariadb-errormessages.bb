SUMMARY = "The error messages files required by server, client and libmariadbd"
DESCRIPTION = "This package provides translated error messages for the standalone \
server daemon, embedded server and client."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "mariadb-errormessages-11.0.2-1.1.noarch.rpm"
RPM_HASH = "d40844b31a1a07919fcbc424625c1197a867e260743352bab8c94d9a272e02f2e80053e42397aa4ad48c3ec4bfd9f2cb5b1496a8211d752de9342f46cefdeae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-errormessages"

RDEPENDS:${PN} += ""

inherit rpm
