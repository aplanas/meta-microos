SUMMARY = "Dynamic Class Mixing"
DESCRIPTION = "The 'mix_class' function provided by this module dynamically generates \
`anonymous' classes with specified inheritance."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Class-Mix-0.006-1.21.noarch.rpm"
RPM_HASH = "01602f07648e3c29f31102e673ca2ec32607310dcf3b85b8cb7a26e6a62b3aaac32bdc470649b6bcc2ef994c8a3ebac3c04ad4dd47424130afadf240ee93b6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Mix \
perl-Class-Mix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Classify \
perl-parent"

inherit rpm
