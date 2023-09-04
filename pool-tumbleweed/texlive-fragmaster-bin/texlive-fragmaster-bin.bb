SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "007f7507ebbc901df817b089bb3981059c062750adc180efcc2dc4595ac441ccd0b6bb8508f91516901bea09193a439f69e19f9c04b53be4403b13a1346624ea"

RPROVIDES:${PN} += "texlive-fragmaster-bin"

RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
