SUMMARY = "MFILE shared modules"
DESCRIPTION = "This distro consists of general, reusable modules. Currently, there is only \
one module, App::MFILE::HTTP, which is used by App::MFILE::WWW, \
App::Dochazka::WWW, and App::Dochazka::CLI."
LICENSE = "BSD-3-Clause"

PV = "0.182"

RPM_NAME = "perl-App-MFILE-0.182-1.20.noarch.rpm"
RPM_HASH = "8368b5aead56cbc9832fb1b83378ffbef378fdf8b60ff2ac5037e7259d3e22b445a071e60471d9be41355cbb7268a5ff6cc2c68748155dd96beb3c1bb4af5583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--MFILE \
perl-App--MFILE--HTTP \
perl-App-MFILE"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-App--CELL \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Params--Validate"

inherit rpm
