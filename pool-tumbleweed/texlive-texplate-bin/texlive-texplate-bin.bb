SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53444"

RPM_NAME = "texlive-texplate-bin-2023.20230311.svn53444-93.2.aarch64.rpm"
RPM_HASH = "00f1d6eba80a0060ca542b4e166b6b1365a3d42aaf1fdf9cc8d8b8864bf9cb56ed49961100b00694d9f5f53ad40fda64e99e7616a5f5907333349cb5a946798a"

RPROVIDES:${PN} += "texlive-texplate-bin"

RDEPENDS:${PN} += "texlive-texplate"

inherit rpm
