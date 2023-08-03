SUMMARY = "Load testing library, command line tool, advanced echo server and web UI"
DESCRIPTION = "Fortio (Φορτίο) started as, and is, Istio's load testing tool and now graduated to be its own project. \
 \
Fortio is also used by, among others, Meshery \
 \
Fortio runs at a specified query per second (qps) and records an histogram of execution time and calculates percentiles (e.g. p99 ie the response time such as 99% of the requests take less than that number (in seconds, SI unit)). It can run for a set duration, for a fixed number of calls, or until interrupted (at a constant target QPS, or max speed/load per connection/thread). \
 \
The name fortio comes from greek φορτίο which means load/burden. \
 \
Fortio is a fast, small (3Mb docker image, minimal dependencies), reusable, embeddable go library as well as a command line tool and server process, the server includes a simple web UI and REST API to trigger run and see graphical representation of the results (both a single latency graph and a multiple results comparative min, max, avg, qps and percentiles graphs). \
 \
Fortio also includes a set of server side features (similar to httpbin) to help debugging and testing: request echo back including headers, adding latency or error codes with a probability distribution, tcp echoing, tcp proxying, http fan out/scatter and gather proxy server, GRPC echo/health in addition to http, etc..."
LICENSE = "Apache-2.0"

PV = "1.57.4"

RPM_NAME = "fortio-1.57.4-1.1.aarch64.rpm"
RPM_HASH = "c8d28ebacdc86df09446cf865361be78b8a4ce15649c3aadb0c74d87f2378a0318340e88d25004632c81bddee4a019cbf7aba3fba4a90070034a543104b57ad2"

RPROVIDES:${PN} += "fortio"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
