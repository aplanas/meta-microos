SUMMARY = "MFILE shared modules"
DESCRIPTION = "This distro consists of general, reusable modules. Currently, there is only \
one module, App::MFILE::HTTP, which is used by App::MFILE::WWW, \
App::Dochazka::WWW, and App::Dochazka::CLI."
LICENSE = "BSD-3-Clause"

PV = "0.182"

RPM_NAME = "perl-App-MFILE-0.182-1.21.noarch.rpm"
RPM_HASH = "0f2513a483e3030226ffc6fcf25cc26066847c595876bf54a3978cffa4880be5bef6760fb4786ffcaaa25778e1352b308929c799228b7af7f633ad133492158a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--MFILE \
perl-App--MFILE--HTTP \
perl-App-MFILE"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Params--Validate"

inherit rpm
