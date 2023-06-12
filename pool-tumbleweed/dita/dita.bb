SUMMARY = "OASIS Darwin Information Typing Architecture (DITA)"
DESCRIPTION = "This package contains the DITA specifications, DTDs, and schemas."
LICENSE = "SUSE-Oasis-Specification-Notice"

PV = "1.1"

RPM_NAME = "dita-1.1-84.16.noarch.rpm"
RPM_HASH = "42c27fd5f82317e5cff34f94d5b153b2be18abd7b4ab35334bb76d4a22639ec2f32ad040ae127fef1d97578c8af5ca8eab59fb3cae23b5a10c3b8f77df5fc391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dita) \
dita"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/edit-xml-catalog \
/usr/bin/sgml-register-catalog \
/usr/bin/xmlcatalog \
awk \
coreutils \
grep \
sed \
sgml-skel"

inherit rpm
