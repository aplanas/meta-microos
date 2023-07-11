SUMMARY = "Javadoc for xgboost-predictor"
DESCRIPTION = "Javadoc for xgboost-predictor"
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "xgboost-predictor-javadoc-0.3.3-1.19.noarch.rpm"
RPM_HASH = "949056440db3ca25190e014269698f5c7729e9171e42665475c143e2eef91107a9ae2f3f0c5e310ea35c3709baa8a3df1ba7438e7993ad0d5ca09e1713c81742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-predictor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
