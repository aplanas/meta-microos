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

RPM_NAME = "perl-File-Find-Object-0.3.7-1.1.noarch.rpm"
RPM_HASH = "378f1047e5bceb06d0e78eeaa418ab383cd1812c0b9e8c27bb77724dc625fafb5a1d6f2d06e055c36e6ee12226ab416bdd2e8f53627bf469b9516d5cc3328072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Find::Object) \
perl(File::Find::Object::Base) \
perl(File::Find::Object::DeepPath) \
perl(File::Find::Object::PathComp) \
perl(File::Find::Object::Result) \
perl(File::Find::Object::TopPath) \
perl-File-Find-Object"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::XSAccessor) \
perl(parent)"

inherit rpm
