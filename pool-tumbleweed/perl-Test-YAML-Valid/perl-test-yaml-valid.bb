SUMMARY = "Test for valid YAML"
DESCRIPTION = "Test for valid YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Test-YAML-Valid-0.04-10.22.noarch.rpm"
RPM_HASH = "cb404ac54d4176f881c0577548972e7f663247c36618f612699dcea8fd5302ebc5585c670de99bf332d43313e51f720a4142e27976f2f9fc7c4aa1a95dbe4345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML--Valid \
perl-Test-YAML-Valid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-YAML"

inherit rpm
