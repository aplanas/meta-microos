SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-2.5.1-28.6.noarch.rpm"
RPM_HASH = "9bb76940551edacc61dea652454d9bce1a8c92249f7e33b96a171f312e4f2513e30da696a2c324c10be85b7781c277f2e7664af259361fcdc8e31cd018ea0195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hibernate-in-process-cache \
jisp2"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-tools \
update-alternatives"

inherit rpm
