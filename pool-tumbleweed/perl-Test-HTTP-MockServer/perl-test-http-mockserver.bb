SUMMARY = "Implement a mock HTTP server for use in tests"
DESCRIPTION = "Sometimes, when writing a test, you don't have to oportunity to do \
dependency injection of the type of transport used in a specific API. \
Sometimes that code willl unequivocally always use actual HTTP and the only \
control you have is over the host and port to which it will connect. \
 \
This class offer a simple way to mock the service being called. It does \
that by binding to a random port on localhost and allowing you to inspect \
which port that was. Using a random port means that this can be used by \
tests running in parallel on the same host. \
 \
The socket will be bound and listened on the main test process, such that \
the lifetime of the connection is defined by the lifetime of the test \
itself. \
 \
Since the socket will be already bound and listened to, the two conntrol \
methods (start_mock_server and stop_mock_server) fork only for the accept \
call, which means that it is safe to call start and stop several times \
during the test in order to change the expectations of the mocked code. \
 \
That allows you to easily configure the expectations of the mock server \
across each step of your test case. On the other hand, it also means that \
no state is shared between the code running in the mock server and the test \
code."
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "perl-Test-HTTP-MockServer-0.0.1-2.10.noarch.rpm"
RPM_HASH = "7b0769bb5995dbfa344e0bf4c0167054d7c11a50f7a860c18b37583e03c4d1dde61dde2e11b8668d6278f65e630d616aa5eb3839b8e5aca3efd893016f3f9c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::HTTP::MockServer) \
perl(Test::HTTP::MockServer::REST) \
perl-Test-HTTP-MockServer"
RDEPENDS:${PN} += "libnss_usrfiles2 \
netcfg \
perl(:MODULE_COMPAT_5.36.0) \
perl(HTTP::Parser) \
perl(HTTP::Response) \
perl(JSON::XS)"

inherit rpm
