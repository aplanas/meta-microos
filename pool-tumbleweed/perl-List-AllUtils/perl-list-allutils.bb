SUMMARY = "Combines List::Util, List::SomeUtils and List::UtilsBy in one bite-sized[cut]"
DESCRIPTION = "Are you sick of trying to remember whether a particular helper is defined \
in List::Util, List::SomeUtils or List::UtilsBy? I sure am. Now you don't \
have to remember. This module will export all of the functions that either \
of those three modules defines. \
 \
Note that all function documentation has been shamelessly copied from \
List::Util, List::SomeUtils and List::UtilsBy."
LICENSE = "Artistic-2.0"

PV = "0.19"

RPM_NAME = "perl-List-AllUtils-0.19-1.10.noarch.rpm"
RPM_HASH = "9552766bf920a5dd00c0ddc1e9259332d6bcfe19d13958c6fd073256480b15e25638e3365e115181cdb558a68bf39193bd6d5c645c2730b45c1295a2a3a33029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--AllUtils \
perl-List-AllUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--SomeUtils \
perl-List--Util \
perl-List--UtilsBy"

inherit rpm
