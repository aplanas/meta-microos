SUMMARY = "The error messages files required by server, client and libmariadbd"
DESCRIPTION = "This package provides translated error messages for the standalone \
server daemon, embedded server and client."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-errormessages-10.11.3-1.1.noarch.rpm"
RPM_HASH = "74ced2f78fcfc9f3aeb2213ec2605e9fe1d6c4f6bf54cdf5916aa31685a1e1e093da69ca578123e1226738aaf13c1a83bda97128dc94d973e7d9eaf0682972ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-errormessages"

RDEPENDS:${PN} += ""

inherit rpm
