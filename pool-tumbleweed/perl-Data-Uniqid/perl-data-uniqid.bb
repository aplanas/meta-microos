SUMMARY = "Perl extension for simple genrating of unique id's"
DESCRIPTION = "Data::Uniqid provides three simple routines for generating unique ids. \
These ids are coded with a Base62 systen to make them short and handy (e.g. \
to use it as part of a URL). \
 \
  suinqid \
    genrates a very short id valid only for the localhost and with a \
    liftime of 1 day \
 \
  uniqid \
    generates a short id valid on the local host \
 \
  luniqid \
    generates a long id valid everywhere and ever"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.12"

RPM_NAME = "perl-Data-Uniqid-0.12-1.24.noarch.rpm"
RPM_HASH = "02c12cc229c6d6caa63f584120db6bd4410d6aa34b7035296ca136e225e7cd1e0bb26d6903e897869844ac6467b0593e7e91c79f73fc36ac702ca7633214b89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Uniqid \
perl-Data-Uniqid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
