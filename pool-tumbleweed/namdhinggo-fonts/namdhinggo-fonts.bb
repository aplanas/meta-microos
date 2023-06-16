SUMMARY = "SIL Limbu Font"
DESCRIPTION = "The Limbu, or Kirat Sirijonga, script is used by around 400,000 people \
in Nepal and India. This Unicode-encoded font has been designed to \
support literacy and materials development in the Limbu language."
LICENSE = "OFL-1.1"

PV = "1.004"

RPM_NAME = "namdhinggo-fonts-1.004-3.17.noarch.rpm"
RPM_HASH = "d5c8e6dfa77ce28d639a249f555e4a806cf344bd6ba255dc6e55b981e201846a31720697d5fd460af8bb8fb2629e371244065ed8ea494a798e6a89b82af0c9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "namdhinggo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
