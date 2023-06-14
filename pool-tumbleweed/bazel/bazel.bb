SUMMARY = "Tool for the automation of building and testing of software"
DESCRIPTION = "Tool for the automation of building and testing of software. It supports Java, \
C++ and Go as programing languages. It also has a support for Android and iOS \
as mobile operating systems."
LICENSE = "Apache-2.0"

PV = "3.7"

RPM_NAME = "bazel-3.7-1.8.aarch64.rpm"
RPM_HASH = "20ec5d3e817678ad7de68191e72eded429fc3585d3dd883cf9f1b4c7bf76e7ef7130b7a8d58395de2ac395c0523622473a5770dd6ff4658a967b8edfc1cc9493"

RPROVIDES:${PN} += "bazel"

RDEPENDS:${PN} += "bazel3.7"

inherit rpm
