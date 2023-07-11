SUMMARY = "An object oriented File::Find replacement"
DESCRIPTION = "File::Find::Object does the same job as File::Find but works like an object \
and with an iterator. As File::Find is not object oriented, one cannot \
perform multiple searches in the same application. The second problem of \
File::Find is its file processing: after starting its main loop, one cannot \
easily wait for another event and so get the next result. \
 \
With File::Find::Object you can get the next file by calling the next() \
function, but setting a callback is still possible."
LICENSE = "Artistic-2.0"

PV = "0.3.7"

RPM_NAME = "perl-File-Find-Object-0.3.7-1.2.noarch.rpm"
RPM_HASH = "7e4ac636810542478b285dff8613897ac484aa8bac8e84e9568297557df8e0548fc5aa41458146c76f54a1666c44ea82ce1818aeee2d818ac39cfe8e65148de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Object \
perl-File--Find--Object--Base \
perl-File--Find--Object--DeepPath \
perl-File--Find--Object--PathComp \
perl-File--Find--Object--Result \
perl-File--Find--Object--TopPath \
perl-File-Find-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--XSAccessor \
perl-parent"

inherit rpm
