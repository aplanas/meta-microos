SUMMARY = "Javadoc for findbugs-bcel"
DESCRIPTION = "Javadoc for findbugs-bcel package."
LICENSE = "Apache-2.0"

PV = "6.0~20140707svn1547656"

RPM_NAME = "findbugs-bcel-javadoc-6.0~20140707svn1547656-1.17.noarch.rpm"
RPM_HASH = "213d9d74c64a823a9f2882d4140ffd707790adc66cc9f05c7952bcf962473407c9d4810fdab9c60aa14909ced38fc152191d9b752d69bde05c78f4b5c54e4a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-bcel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
