SUMMARY = "The simple build tool for Scala and Java projects"
DESCRIPTION = "sbt is the simple build tool for Scala and Java projects."
LICENSE = "BSD-3-Clause"

PV = "0.13.18"

RPM_NAME = "sbt-0.13.18-13.1.noarch.rpm"
RPM_HASH = "73862a76b47ff5ebd2070f8256ab184ff904851aba618a2f24d4ad58d511b261b712d11ca93441baa4223e7528f354c77af45073cf1680c48a46d835430e1fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-actions \
mvn-org.scala-sbt-actions-pom- \
mvn-org.scala-sbt-api \
mvn-org.scala-sbt-api-pom- \
mvn-org.scala-sbt-apply-macro \
mvn-org.scala-sbt-apply-macro-pom- \
mvn-org.scala-sbt-cache \
mvn-org.scala-sbt-cache-pom- \
mvn-org.scala-sbt-classfile \
mvn-org.scala-sbt-classfile-pom- \
mvn-org.scala-sbt-classpath \
mvn-org.scala-sbt-classpath-pom- \
mvn-org.scala-sbt-collections \
mvn-org.scala-sbt-collections-pom- \
mvn-org.scala-sbt-command \
mvn-org.scala-sbt-command-pom- \
mvn-org.scala-sbt-compile \
mvn-org.scala-sbt-compile-pom- \
mvn-org.scala-sbt-compiler-integration \
mvn-org.scala-sbt-compiler-integration-pom- \
mvn-org.scala-sbt-compiler-interface \
mvn-org.scala-sbt-compiler-interface-pom- \
mvn-org.scala-sbt-compiler-ivy-integration \
mvn-org.scala-sbt-compiler-ivy-integration-pom- \
mvn-org.scala-sbt-completion \
mvn-org.scala-sbt-completion-pom- \
mvn-org.scala-sbt-control \
mvn-org.scala-sbt-control-pom- \
mvn-org.scala-sbt-cross \
mvn-org.scala-sbt-cross-pom- \
mvn-org.scala-sbt-datatype-generator \
mvn-org.scala-sbt-datatype-generator-pom- \
mvn-org.scala-sbt-incremental-compiler \
mvn-org.scala-sbt-incremental-compiler-pom- \
mvn-org.scala-sbt-interface \
mvn-org.scala-sbt-interface-pom- \
mvn-org.scala-sbt-io \
mvn-org.scala-sbt-io-pom- \
mvn-org.scala-sbt-ivy \
mvn-org.scala-sbt-ivy-pom- \
mvn-org.scala-sbt-logging \
mvn-org.scala-sbt-logging-pom- \
mvn-org.scala-sbt-logic \
mvn-org.scala-sbt-logic-pom- \
mvn-org.scala-sbt-main \
mvn-org.scala-sbt-main-pom- \
mvn-org.scala-sbt-main-settings \
mvn-org.scala-sbt-main-settings-pom- \
mvn-org.scala-sbt-persist \
mvn-org.scala-sbt-persist-pom- \
mvn-org.scala-sbt-process \
mvn-org.scala-sbt-process-pom- \
mvn-org.scala-sbt-relation \
mvn-org.scala-sbt-relation-pom- \
mvn-org.scala-sbt-run \
mvn-org.scala-sbt-run-pom- \
mvn-org.scala-sbt-sbt \
mvn-org.scala-sbt-sbt-maven-resolver \
mvn-org.scala-sbt-sbt-maven-resolver-pom- \
mvn-org.scala-sbt-sbt-pom- \
mvn-org.scala-sbt-scripted-framework \
mvn-org.scala-sbt-scripted-framework-pom- \
mvn-org.scala-sbt-scripted-plugin \
mvn-org.scala-sbt-scripted-plugin-pom- \
mvn-org.scala-sbt-scripted-sbt \
mvn-org.scala-sbt-scripted-sbt-pom- \
mvn-org.scala-sbt-task-system \
mvn-org.scala-sbt-task-system-pom- \
mvn-org.scala-sbt-tasks \
mvn-org.scala-sbt-tasks-pom- \
mvn-org.scala-sbt-test-agent \
mvn-org.scala-sbt-test-agent-pom- \
mvn-org.scala-sbt-testing \
mvn-org.scala-sbt-testing-pom- \
mvn-org.scala-sbt-tracking \
mvn-org.scala-sbt-tracking-pom- \
sbt"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-lang3 \
apache-ivy \
atinject \
guava \
hamcrest-core \
jansi \
java-headless \
javapackages-filesystem \
javapackages-tools \
jawn-json4s \
jawn-parser \
jawn-util \
jline \
jsch \
json4s-ast \
json4s-core \
jsr-305 \
junit \
maven-lib \
maven-resolver-api \
maven-resolver-connector-basic \
maven-resolver-impl \
maven-resolver-spi \
maven-resolver-util \
mvn-com.google.guava-guava \
mvn-com.jcraft-jsch \
mvn-javax.inject-javax.inject \
mvn-jline-jline \
mvn-org.apache.ivy-ivy \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.eclipse.aether-aether-connector-basic \
mvn-org.eclipse.aether-aether-impl \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-reflect \
mvn-org.scala-sbt-launcher-interface \
mvn-org.scala-sbt-serialization-2.10 \
mvn-org.scala-sbt-template-resolver \
mvn-org.scala-sbt-test-interface \
mvn-org.scala-tools.sbinary-sbinary-2.10 \
paranamer \
plexus-classworlds \
plexus-containers-component-annotations \
plexus-interpolation \
plexus-utils \
quasiquotes \
sbinary \
sbt-launcher \
sbt-launcher-interface \
scala \
scala-pickling \
serialization \
sisu-inject \
sisu-plexus \
slf4j \
template-resolver \
test-interface"

inherit rpm
