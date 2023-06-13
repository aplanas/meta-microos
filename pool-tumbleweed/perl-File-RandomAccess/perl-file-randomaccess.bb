SUMMARY = "Random access reads of sequential file or scalar"
DESCRIPTION = "Allows random access to sequential file by buffering the file if \
necessary. Also allows access to data in memory to be accessed as \
if it were a file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.62"

RPM_NAME = "perl-File-RandomAccess-12.62-1.1.noarch.rpm"
RPM_HASH = "0f4c789ec631c6bf299db09296baaf48b3258fb53b6e9db334b618b41e81c37c3600ed4deb2ebc932368e8f5c51f3726eb54234cbcafa075e387e2543ea27187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::RandomAccess) \
perl-File-RandomAccess"

RDEPENDS:${PN} += ""

inherit rpm
