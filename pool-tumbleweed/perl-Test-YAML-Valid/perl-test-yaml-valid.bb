SUMMARY = "Test for valid YAML"
DESCRIPTION = "Test for valid YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Test-YAML-Valid-0.04-10.21.noarch.rpm"
RPM_HASH = "db388f4842ddd48b029d937965e29ca1c55d7b5170b147a44db4b53f63c5fe134797721a1ad10c8ab1b0928b4ff13fee4fcd90309daacfeae617448a0fbe64c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::YAML::Valid) \
perl-Test-YAML-Valid"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(YAML)"

inherit rpm
