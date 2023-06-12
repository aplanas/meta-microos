SUMMARY = "Tool for downloading and updating Linux kernel source trees"
DESCRIPTION = "This tool synchronises a local kernel tree with a desired kernel ver- \
sion and patch set from a kernel.org mirror. The default requires a GPG \
key on your keyring, to verify the identity of the patches and source \
archives. Entire kernel images are not downloaded unless necessary, so \
bandwidth is saved. Patches are applied and removed as necessary to \
attain the requested version. \
 \
 \
 \
Authors: \
-------- \
    Matt Mackall <mpm@selenic.com>"
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "ketchup-1.0.1-110.16.noarch.rpm"
RPM_HASH = "8732b3dc35cfdad212de37cea0097280000342b5de0a02bbe678e34d59d8069254eaf4d67bfd57cd843623e137b53490927c06b4953a52b5e01df22ba0cd9f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ketchup"
RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
