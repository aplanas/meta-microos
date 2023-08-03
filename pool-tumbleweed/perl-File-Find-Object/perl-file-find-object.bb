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

RPM_NAME = "perl-File-Find-Object-0.3.8-1.1.noarch.rpm"
RPM_HASH = "6d3bcb4e98d7607be03382584321a0eca81055e8d0a0e0ddd48efac0ede8a0e3ee98c4a8af656075d9091260095a7e266d4854d217c242a1b23f15e62e84ff88"
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
