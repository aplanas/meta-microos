SUMMARY = "Dynamic Class Mixing"
DESCRIPTION = "The 'mix_class' function provided by this module dynamically generates \
`anonymous' classes with specified inheritance."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.006"

RPM_NAME = "perl-Class-Mix-0.006-1.20.noarch.rpm"
RPM_HASH = "a31031a447e86b28ad4952bae861124f9d0617b823ddea96352f0959122529a91f8296c174672a5bb24de3d032f7c9904465a40ba7b0960e680aab32adbe6f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Mix \
perl-Class-Mix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Params--Classify \
perl-parent"

inherit rpm
