SUMMARY = "Simple sprintf-like dialect"
DESCRIPTION = "String::Errf provides 'errf', a simple string formatter that works \
something like 'sprintf'. It is implemented using String::Formatter and \
Sub::Exporter. Their documentation may be useful in understanding or \
extending String::Errf. The 'errf' subroutine is only available when \
imported. Calling String::Errf::errf will not do what you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-Errf-0.009-1.4.noarch.rpm"
RPM_HASH = "a1f7185506b6ea74807ac76ae797cd0cb93857e2d6c46487657b800535ee7eaf95709d5cd8d5347aaa6c199b459c80b5db01e8048e3c307cf86e154947bcd37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Errf \
perl-String-Errf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Util \
perl-String--Formatter \
perl-Sub--Exporter \
perl-Time--Piece \
perl-parent"

inherit rpm
