SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn59817"

RPM_NAME = "texlive-optexcount-bin-2023.20230311.svn59817-93.2.aarch64.rpm"
RPM_HASH = "4da86d15df18cf54447483bc9e73a7a81fb67debe392e7eada8d5768f8eb719c852870deccdd636c89cc9d4fa01e22e3564dd9fc4dd97208bf00e976ca2cc759"

RPROVIDES:${PN} += "texlive-optexcount-bin"

RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm
