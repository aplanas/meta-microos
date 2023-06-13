SUMMARY = "Gradient Boosting (GBDT, GBRT or GBM) Library"
DESCRIPTION = "Scalable, Portable and Distributed Gradient Boosting (GBDT, GBRT or \
GBM) Library, for Python, R, Java, Scala, C++ and more. Runs on \
single machine, Hadoop, Spark, Flink and DataFlow"
LICENSE = "Apache-2.0"

PV = "0.90"

RPM_NAME = "xgboost-0.90-3.3.aarch64.rpm"
RPM_HASH = "3d9bd6991310d8b829d6c4c23292a9da87b159562ee150d0fcd8770c8c2192f935b189aff7af6732a2f6b05ef9619938750a2b2482a5fd3f327a53c9805daa84"

RPROVIDES:${PN} += "mvn(ml.dmlc:xgboost-jvm:pom:) \
mvn(ml.dmlc:xgboost4j) \
mvn(ml.dmlc:xgboost4j:pom:) \
xgboost \
xgboost(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.esotericsoftware.kryo:kryo) \
mvn(com.typesafe.akka:akka-actor_2.10) \
mvn(commons-logging:commons-logging) \
mvn(org.scala-lang:scala-compiler) \
mvn(org.scala-lang:scala-library) \
mvn(org.scala-lang:scala-reflect)"

inherit rpm
