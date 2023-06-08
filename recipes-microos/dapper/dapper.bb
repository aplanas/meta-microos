SUMMARY = "Docker build wrapper"
DESCRIPTION = "Dapper is a tool to wrap any existing build tool in an consistent environment. This allows people to build your software from source or modify it without worrying about setting up a build environment. The approach is very simple and taken from a common pattern that has adopted by many open source projects. Create a file called Dockerfile.dapper in the root of your repository. Dapper will build that Dockerfile and then execute a container based off of the resulting image. Dapper will also copy in source files and copy out resulting artifacts or will use bind mounting if you choose."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "dapper-0.6.0-1.5.aarch64.rpm"
RPM_HASH = "b8ff8e7fb59af8cd627ba692c3009ffc7a48f0bb0beb65ef70d824c5f1b40e679e08206377d1a3c945ec91147134767754fbaf7bb5380da9d40595a4c2951596"

RPROVIDES:${PN} += "dapper dapper(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
