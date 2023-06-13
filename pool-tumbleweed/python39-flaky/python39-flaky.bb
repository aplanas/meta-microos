SUMMARY = "Plugin for nose or py.test that automatically reruns flaky tests"
DESCRIPTION = "Flaky is a plugin for py.test that automatically reruns flaky tests. \
 \
Ideally, tests reliably pass or fail, but sometimes test fixtures must rely on components that aren't 100% \
reliable. With flaky, instead of removing those tests or marking them to @skip, they can be automatically \
retried. \
 \
For more information about flaky, see `this presentation <http://opensource.box.com/flaky/>`_."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python39-flaky-3.7.0-3.1.noarch.rpm"
RPM_HASH = "9c797baf4adae4b19f902b1f0d3c4761a3995b1d521f9bd49a399d0a5a7a41a932054e454cb5397eb40de20c2dec7fcb96a578adacf209cd45d732ab7a7f896a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flaky) \
python39-flaky \
python3dist(flaky)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
