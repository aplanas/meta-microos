SUMMARY = "Gradient Boosting (GBDT, GBRT or GBM) Library"
DESCRIPTION = "Scalable, Portable and Distributed Gradient Boosting (GBDT, GBRT or \
GBM) Library, for Python, R, Java, Scala, C++ and more. Runs on \
single machine, Hadoop, Spark, Flink and DataFlow"
LICENSE = "Apache-2.0"

PV = "0.90"

RPM_NAME = "xgboost-0.90-3.4.aarch64.rpm"
RPM_HASH = "e7c24f06c8073aba15450adc978c43e8b654cb8097e03bbf2196a1984be1180cc8ed50f005f536adb3f8f2f74f93ef67f35a5b713a668749ec9eb01566833eba"

RPROVIDES:${PN} += "mvn-ml.dmlc-xgboost-jvm-pom- \
mvn-ml.dmlc-xgboost4j \
mvn-ml.dmlc-xgboost4j-pom- \
xgboost"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.esotericsoftware.kryo-kryo \
mvn-com.typesafe.akka-akka-actor-2.10 \
mvn-commons-logging-commons-logging \
mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-reflect"

inherit rpm
