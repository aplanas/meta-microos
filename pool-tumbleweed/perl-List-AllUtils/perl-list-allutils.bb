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

RPM_NAME = "perl-List-AllUtils-0.19-1.11.noarch.rpm"
RPM_HASH = "9cbff290a668e9f869cd41051daf8cd620ad116acdddba12f1077ee0edb1bfada7b5f67c97ea51a23697d4c96efc1e953463f458d256f66168c4b739e4286b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--AllUtils \
perl-List-AllUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--SomeUtils \
perl-List--Util \
perl-List--UtilsBy"

inherit rpm
