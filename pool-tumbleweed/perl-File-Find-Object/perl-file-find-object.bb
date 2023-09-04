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

PV = "0.3.8"

RPM_NAME = "perl-File-Find-Object-0.3.8-1.2.noarch.rpm"
RPM_HASH = "a9363754bce274ea54bf9b7b47ad1b76ac8e776c2445110356f340bd726ff6c5e2b64b4249f88486d25f35ff1f5b420959892ad57a1a440ee2a13c68224c81df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Object \
perl-File--Find--Object--Base \
perl-File--Find--Object--DeepPath \
perl-File--Find--Object--PathComp \
perl-File--Find--Object--Result \
perl-File--Find--Object--TopPath \
perl-File-Find-Object"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--XSAccessor \
perl-parent"

inherit rpm
