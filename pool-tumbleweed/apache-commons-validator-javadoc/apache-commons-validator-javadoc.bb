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

RPM_NAME = "apache-commons-validator-javadoc-1.5.0-3.4.noarch.rpm"
RPM_HASH = "160fb9a1ced929940ff6ca37fff218acd7b820217a4c1afb5b2196b363df30e59f776c0c79741f6668f117322ac9c529175194d10fdebbef6cb25f3d6ecd6c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-validator-javadoc"

RDEPENDS:${PN} += "coreutils \
javapackages-filesystem"

inherit rpm
