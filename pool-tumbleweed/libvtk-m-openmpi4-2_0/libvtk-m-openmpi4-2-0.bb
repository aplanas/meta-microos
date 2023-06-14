SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libvtk-m-openmpi4-2_0-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "9149e51e0834a3a0ec7831c12ae8cb537439296c9b8b14b56e616f5269c601b5d201ba377ecce912712c26d42aadc3f02cf92b7eb27c0ea6a353fe1bb2fc0f33"

RPROVIDES:${PN} += "libvtk-m-openmpi4-2-0 \
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
libvtkmdiympi.so.2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
openmpi4"

inherit rpm
