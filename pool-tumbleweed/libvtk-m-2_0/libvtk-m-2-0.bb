SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libvtk-m-2_0-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "ec9a78aa1b647ad6b10db818dfcf4fbcaadb450276ccc523d6d8d032b5ac5d7d2f6751d24eab0c145cf169e4c7a650c08b6d1f03d16a916bc9115af1ca495ca8"

RPROVIDES:${PN} += "libvtk-m-2-0 \
libvtkm-cont-testing.so.2.0 \
libvtkm-cont.so.2.0 \
libvtkm-filter-clean-grid.so.2.0 \
libvtkm-filter-connected-components.so.2.0 \
libvtkm-filter-contour.so.2.0 \
libvtkm-filter-core.so.2.0 \
libvtkm-filter-density-estimate.so.2.0 \
libvtkm-filter-entity-extraction.so.2.0 \
libvtkm-filter-field-conversion.so.2.0 \
libvtkm-filter-field-transform.so.2.0 \
libvtkm-filter-flow.so.2.0 \
libvtkm-filter-geometry-refinement.so.2.0 \
libvtkm-filter-image-processing.so.2.0 \
libvtkm-filter-mesh-info.so.2.0 \
libvtkm-filter-multi-block.so.2.0 \
libvtkm-filter-resampling.so.2.0 \
libvtkm-filter-scalar-topology.so.2.0 \
libvtkm-filter-vector-analysis.so.2.0 \
libvtkm-filter-zfp.so.2.0 \
libvtkm-io.so.2.0 \
libvtkm-rendering-testing.so.2.0 \
libvtkm-rendering.so.2.0 \
libvtkm-source.so.2.0 \
libvtkm-worklet.so.2.0 \
libvtkmdiympi-nompi.so.2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
