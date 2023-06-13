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

RPM_NAME = "perl-List-AllUtils-0.19-1.9.noarch.rpm"
RPM_HASH = "4c824271fd6345e53f54db62f8a7c414ee1b5d553756d4fd1a209170a57798a0750e4b48e40bb1dc310c94bde9ee808c51b7762d6b5f001fb49edbdafe54f7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(List::AllUtils) \
perl-List-AllUtils"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(List::SomeUtils) \
perl(List::Util) \
perl(List::UtilsBy)"

inherit rpm
