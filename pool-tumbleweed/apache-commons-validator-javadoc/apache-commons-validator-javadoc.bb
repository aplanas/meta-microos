SUMMARY = "Javadoc for jakarta-commons-validator"
DESCRIPTION = "A common issue when receiving data either electronically or from user \
input is verifying the integrity of the data. This work is repetitive \
and becomes even more complicated when different sets of validation \
rules need to be applied to the same set of data based on locale for \
example. Error messages may also vary by locale. This package attempts \
to address some of these issues and speed development and maintenance \
of validation rules. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Validator Package."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-validator-javadoc-1.5.0-3.5.noarch.rpm"
RPM_HASH = "296e6ba7a0243c75659f4bd5ac84b99d0571654bcf5406a5d177671615661d401a104d412a597bcc257dc36c92b13293266a9d315e5e2cc31bd0f090b7f045d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-validator-javadoc"

RDEPENDS:${PN} += "coreutils \
javapackages-filesystem"

inherit rpm
