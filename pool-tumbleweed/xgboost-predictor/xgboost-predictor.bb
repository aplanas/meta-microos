SUMMARY = "Pure Java implementation of Xgboost predictor for online prediction tasks"
DESCRIPTION = "Pure Java implementation of XGBoost predictor for online prediction tasks."
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "xgboost-predictor-0.3.3-1.19.noarch.rpm"
RPM_HASH = "18b41430cd569bb4e7c58e323ea97408ed4d4dc863684699980dff6e67ca22873d347cc4fee3c983454df43e80ea9a1f6685f214f45225026bff9a9b46d19263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-ai.h2o-xgboost-predictor \
mvn-ai.h2o-xgboost-predictor-pom- \
mvn-biz.k11i-xgboost-predictor \
mvn-biz.k11i-xgboost-predictor-pom- \
xgboost-predictor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.jafama-jafama"

inherit rpm
