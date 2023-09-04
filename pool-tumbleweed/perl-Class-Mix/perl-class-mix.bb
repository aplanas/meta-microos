SUMMARY = "Dynamic Class Mixing"
DESCRIPTION = "The 'mix_class' function provided by this module dynamically generates \
`anonymous' classes with specified inheritance."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Class-Mix-0.006-1.22.noarch.rpm"
RPM_HASH = "bb278d1978e21fc39f4993c45de474198a61f384389cced8b050b1c06b3ac6f5fe8777abbdae9285cf27117c8245e5cd2686080cd11e6e4a2e888910f293e6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Mix \
perl-Class-Mix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Classify \
perl-parent"

inherit rpm
