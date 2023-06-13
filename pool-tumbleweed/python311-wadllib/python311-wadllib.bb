SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python311-wadllib-1.3.6-1.8.noarch.rpm"
RPM_HASH = "340bb0cd6d996ab8e119eef9744c9caa60c06befbf12ef4b1dfe2a851c045f9a16460e9f2dca076236ae45acb644870a431fb021dadfb39464b06d9785a59598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wadllib) \
python311-wadllib \
python3dist(wadllib)"

RDEPENDS:${PN} += "python(abi) \
python311-lazr.uri"

inherit rpm
